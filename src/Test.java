public class Test {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        StringBuffer s2 = new StringBuffer("abc");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
