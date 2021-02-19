package util;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DataUtil {


    /**
     * Parse CSV to Bean List.<br/>
     * https://springhow.com/opencsv/ <br/>
     * https://blog.csdn.net/oschina_41803965/article/details/120351253 <br/>
     * @param csvPath    csv relative path
     * @param recordType record type
     * @param <T>        record type
     * @return record list as type provided
     */
    public static <T> List<T> getRecoardList(String csvPath, Class<T> recordType) {
        InputStream resStream = DataUtil.class.getClassLoader().getResourceAsStream(csvPath);
        CsvToBeanBuilder<T> beanBuilder = new CsvToBeanBuilder<>(new InputStreamReader(resStream, StandardCharsets.UTF_8));
        List<T> data = beanBuilder.withType(recordType).build().parse();
        return data;
    }


}
