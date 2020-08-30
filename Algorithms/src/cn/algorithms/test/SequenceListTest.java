package cn.algorithms.test;

import cn.algorithms.linear.SequenceList;

/**
 * SequenceListTest
 *
 * @author wang
 * @date 2020/8/29
 **/
public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> sequenceList=new SequenceList<>(3);
        sequenceList.insert("詹姆斯");
        sequenceList.insert("科比");
        sequenceList.insert("麦迪");
        sequenceList.insert(0,"库里");
        for (String s: sequenceList) {
            System.out.println(s);
        }
        System.out.println(" ");

        String getResult = sequenceList.get(1);
        System.out.println(getResult);

        String removeResult = sequenceList.remove(0);
        System.out.println(removeResult);

        sequenceList.clear();

        System.out.println(sequenceList.get(1));
        System.out.println(sequenceList.isEmpty());
    }
}
