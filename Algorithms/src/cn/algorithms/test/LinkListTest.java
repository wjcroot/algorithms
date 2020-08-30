package cn.algorithms.test;

import cn.algorithms.linear.LinkList;



/**
 * LinkListTest
 *
 * @author wang
 * @date 2020/8/30
 **/
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<String> linkedList=new LinkList<>();
        linkedList.insert("詹姆斯");
        linkedList.insert("科比");
        linkedList.insert("麦迪");
        linkedList.insert(0,"库里");
        for (String s: linkedList) {
            System.out.println(s);
        }
        System.out.println(" ");

        String getResult = linkedList.get(1);
        System.out.println(getResult);

        String removeResult = linkedList.remove(0);
        System.out.println(removeResult);

        linkedList.clear();

        System.out.println(linkedList.get(1));
        System.out.println(linkedList.isEmpty());
    }
}
