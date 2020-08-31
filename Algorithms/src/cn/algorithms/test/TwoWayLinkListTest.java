package cn.algorithms.test;

import cn.algorithms.linear.TwoWayLinkList;

/**
 * TwoWayLinkListTest
 *
 * @author wang
 * @date 2020/8/31
 **/
public class TwoWayLinkListTest {
    public static void main(String[] args) {
        TwoWayLinkList<String> linkedList=new TwoWayLinkList<>();

        linkedList.insert("詹姆斯");
        linkedList.insert("科比");
        linkedList.insert("麦迪");
        linkedList.insert(0,"库里");
        System.out.println(linkedList.length());
        for (String s: linkedList) {
            System.out.println(s);
        }
        System.out.println(" ");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(" ");

        String getResult = linkedList.get(1);
        System.out.println(getResult);

        String removeResult = linkedList.remove(0);
        System.out.println(removeResult);
        System.out.println(linkedList.length());

        linkedList.clear();

        System.out.println(linkedList.get(1));
        System.out.println(linkedList.isEmpty());
    }
}
