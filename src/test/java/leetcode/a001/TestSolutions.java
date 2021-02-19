package leetcode.a001;

import common.Utils;

import java.util.List;

public class TestSolutions {

//    @Test(dataProvider = "data")
    public void test1(List<DataEntry> dataEntryList) {
        Main solution = new Main();
        for (DataEntry entry : dataEntryList) {
            int[] expected = entry.getExpected();
            int[] nums = entry.getNums();
            int target = entry.getTarget();
            int[] result = solution.twoSum1(nums, target);
//            Assert.assertEquals(result, expected);
        }
    }

//    @Test(dataProvider = "data")
    public void test2(List<DataEntry> dataEntryList) {
        Main solution = new Main();
        for (DataEntry entry : dataEntryList) {
            int[] expected = entry.getExpected();
            int[] nums = entry.getNums();
            int target = entry.getTarget();
            int[] result = solution.twoSum2(nums, target);
//            Assert.assertEquals(result, expected);
        }
    }

//    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        List<DataEntry> dataEntryList = Utils.parseJSON2List("data.json", DataEntry.class);;
        return new Object[][] { { dataEntryList } };
    }

}

