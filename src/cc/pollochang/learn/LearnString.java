package cc.pollochang.learn;

import java.util.StringTokenizer;

public class LearnString {
    public static void main(String[] args){
        LearnString learn  = new LearnString();
        learn.learn1();
    }

    /**
     * 切字串研究split 與 StringTokenizer 不同
     * spilt 不會去除null
     */
    private void learn1(){
        String checkString = ",1,2,3,4, ,5,6,";

        System.out.println("======split======");
        Object[] views = checkString.split(",");

        for(Object next: views){
            System.out.println(next);
        }

        System.out.println("======StringTokenizer=======");

        StringTokenizer tokenizer = new StringTokenizer(checkString,",");

        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }
}
