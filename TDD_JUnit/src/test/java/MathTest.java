import org.junit.Assert;
import org.junit.Test;


public class MathTest {

    @Test
    public void testFindMaxInPositiveNumber() {
        int[] numbers = {0, 12, 3, 4, 8, 9, 55, 12, 99, 101};
        final int result = Math.findMax(numbers);
        Assert.assertEquals(result, 101);
    }

    @Test
    public void testFindMaxInNegativeNumbers() {
        int[] numbers = {0, -12, -3, -4, -8, -9, -55, -12, -99, -101};
//        int result = Arrays.stream(numbers).min().getAsInt();
        final int result = Math.findMax(numbers);
        Assert.assertEquals(-101, result);
    }

    @Test
    public void testIsSumCorrect() {
        int[] numbers = {1, 2, 3};
        int result = Math.sumCorrect(numbers);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testisAverage() {
        int[] numbers = {1, 2, 3};
        float result = Math.Average(numbers);
        Assert.assertEquals(result, 2, 0.01);
    }

    @Test
    public void testFactorialFour() {
        int expected = 24;
        int factorial = Math.factorial(4);
        Assert.assertEquals(expected, factorial);
    }

    @Test
    public void testFactorialEqualsOne() {
        int expected = 1;
        int factorial = Math.factorial(1);
        Assert.assertEquals(expected, factorial);
    }

    @Test
    public void testFactorialEqualsZero(){
        int expected = 1;
        int factorial = Math.factorial(0);
        Assert.assertEquals(factorial, expected);
    }
    @Test
    public void testMultiplyArrayOfThreeElements(){
        int ratio = Math.multiplyArray(new int[] {5, 2, 3});
        int result = 30;
        Assert.assertEquals(result, ratio);
    }
    @Test
    public void findMin(){
        int[] numbers = {1, 12, 3, 4, 8, 9, 55, 12, 99, 101};
        final int result = Math.findMin(numbers);
        Assert.assertEquals(result, 1);
    }


    @Test
    public void isUserExist(){
        String [] users = {"Pablo", "Kamil", "Pablo"};
        UserService userService = new UserService(users);
        boolean result = userService.isExist("Kamil");
        Assert.assertTrue(result);
    }
    @Test
    public void getUsersCountTest(){
        String [] users = {"Pablo", "Kamil", "Pablo"};
        int length = users.length;
        UserService userService = new UserService(users);
        Assert.assertEquals(length, userService.getUsersCount());
    }

}
