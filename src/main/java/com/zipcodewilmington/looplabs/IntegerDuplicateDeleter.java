package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int count1 = 0;
        for (Integer s : super.array) {
            for (Integer g : super.array) {
                if (s.equals(g)) count++;
            }
            if (count >= maxNumberOfDuplications) count1++;
            count = 0;
        }
        if (count1 == super.array.length) return new Integer[0];
        int l = 0;
        Integer[] intArray = new Integer[super.array.length - count1];
        int count2 = 0;
        for (Integer s : super.array) {
            if (l == intArray.length) break;
            for (Integer g : super.array) {
                if (s.equals(g)) {
                    count2++;
                }
            }
            if (count2 < maxNumberOfDuplications) {
                intArray[l] = s;
                l++;
            }
            count2=0;
        }
        return intArray;
    }
//        int count = 0;
//        ArrayList<Integer> toKeep = new ArrayList<>();
//        for (Integer i : super.array) {
//            for (Integer j : super.array) {
//                if (i == j) count++;
//            }
//            if (count < maxNumberOfDuplications) {
//                toKeep.add(i);
//            }
//            count = 0;
//        }
//        return toKeep.toArray(new Integer[0]);
//    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        int count1 = 0;
        for (Integer s : super.array) {
            for (Integer g : super.array) {
                if (s.equals(g)) count++;
            }
            if (count == exactNumberOfDuplications) count1++;
            count = 0;
        }
        if (count1 == super.array.length) return new Integer[0];
        System.out.println(super.array.length - count1);
        int l = 0;
        Integer[] intArray = new Integer[super.array.length - count1];
        int count2 = 0;
        for (Integer s : super.array) {
            if (l == (intArray.length)) break;
            for (Integer g : super.array) {
                if (s.equals(g)) {
                    count2++;
                }
            }
            if (count2 != exactNumberOfDuplications) {
                intArray[l] = s;
                l++;
            }
            count2 = 0;
        }
        for (Integer s : intArray) {
            System.out.print(s + " ");
        }
        return intArray;
    }
//        int count = 0;
//        ArrayList<Integer> toKeep = new ArrayList<>();
//        for (Integer i : super.array) {
//            for (Integer j : super.array) {
//                if (i == j) count++;
//            }
//            if (count != exactNumberOfDuplications) {
//                toKeep.add(i);
//            }
//            count = 0;
//        }
//        return toKeep.toArray(new Integer[0]);
//    }
}
