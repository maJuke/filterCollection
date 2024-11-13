package org.example;

import java.util.*;



public class Main {

    public static void main(String[] args) {
        WithFilter withFilter = new WithFilter();

        /***********************************************************/
        System.out.println("New array:");
        List<Double> list = Arrays.asList(0.2, 2.5, 10.5);
        for (double dd : list) {
            System.out.println(dd);
        }

        System.out.println("/***********************************/");

        for (Object dd : filter(list, withFilter)) {
            System.out.println(dd);
        }

        /***********************************************************/
        System.out.println("New array:");
        List<Integer> list2 = Arrays.asList(2, 5, 10);
        for (Integer dd : list2) {
            System.out.println(dd);
        }

        System.out.println("/***********************************/");

        for (Object dd : filter(list2, withFilter)) {
            System.out.println(dd);
        }

        /***********************************************************/
        System.out.println("New array:");
        List<Float> list3 = Arrays.asList(0.2f, 2.5f, 10.5f);
        for (float dd : list3) {
            System.out.println(dd);
        }

        System.out.println("/***********************************/");

        for (Object dd : filter(list3, withFilter)) {
            System.out.println(dd);
        }

        /***********************************************************/
        System.out.println("New array:");
        List<String> list4 = Arrays.asList("Олег");
        for (String dd : list4) {
            System.out.println(dd);
        }

        System.out.println("/***********************************/");

        for (Object dd : filter(list4, withFilter)) {
            System.out.println(dd);
        }
    }

    public static ArrayList<?> filter(Collection<?> oldCol, WithFilter withFilter) {
        ArrayList<Object> newCol = new ArrayList<>();
        for (Object obj : oldCol) {
            newCol.add(withFilter.apply(obj));
        }
        return newCol;
    }


}