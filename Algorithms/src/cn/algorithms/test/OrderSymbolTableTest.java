package cn.algorithms.test;

import cn.algorithms.symbol.OrderSymbolTable;

/**
 * OrderSymbolTableTest
 *
 * @author wang
 * @date 2020/9/3
 **/
public class OrderSymbolTableTest {
    public static void main(String[] args) {
        OrderSymbolTable<Integer,String> symbolTable=new OrderSymbolTable<>();
        symbolTable.put(1,"a");
        symbolTable.put(2,"b");
        symbolTable.put(5,"e");
        symbolTable.put(3,"c");
        symbolTable.put(4,"d");
        System.out.println("插入完毕，元素个数为："+symbolTable.size());

        symbolTable.put(2,"f");
        System.out.println("替换完毕，键2对应的元素："+symbolTable.get(2));
        System.out.println("替换完毕，元素个数为："+symbolTable.size());

        symbolTable.delete(3);
        System.out.println("删除完毕，元素个数为："+symbolTable.size());
    }
}
