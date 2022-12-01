package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int count1 = 0;
        for (String s : super.array) {
            for (String g : super.array) {
                if (s.equals(g)) count++;
            }
            if (count >= maxNumberOfDuplications) count1++;
            count = 0;
        }
        if (count1 == super.array.length) return new String[0];
        int l = 0;
        String[] strArray = new String[super.array.length - count1];
        int count2 = 0;
        for (String s : super.array) {
            if (l == strArray.length) break;
            for (String g : super.array) {
                if (s.equals(g)) {
                    count2++;
                }
            }
            if (count2 <= maxNumberOfDuplications) {
                strArray[l] = s;
                l++;
            }
            count2=0;
        }
        return strArray;
    }
//        int count = 0;
//        ArrayList<String> toKeep = new ArrayList<>();
//        for (String s : super.array) {
//            for (String g : super.array) {
//                if (s.equals(g)) count++;
//            }
//            if (count < maxNumberOfDuplications) {
//                toKeep.add(s);
//            }
//            count = 0;
//        }
//        return toKeep.toArray(new String[0]);

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        int count1 = 0;
        for (String s : super.array) {
            for (String g : super.array) {
                if (s.equals(g)) count++;
            }
            if (count == exactNumberOfDuplications) count1++;
            count = 0;
        }
        if (count1 == super.array.length) return new String[0];
        System.out.println(super.array.length - count1);
        int l = 0;
        String[] strArray = new String[super.array.length - count1];
        int count2 = 0;
        for (String s : super.array) {
            if (l == (strArray.length)) break;
            for (String g : super.array) {
                if (s.equals(g)) {
                    count2++;
                }
            }
            if (count2 != exactNumberOfDuplications) {
                strArray[l] = s;
                l++;
            }
            count2 = 0;
        }
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        return strArray;
    }
//        int count = 0;
//        ArrayList<String> toKeep = new ArrayList<>();
//        for (String s : super.array) {
//            for (String g : super.array) {
//                if (s.equals(g)) count++;
//            }
//            if (count != exactNumberOfDuplications) {
//                toKeep.add(s);
//            }
//            count = 0;
//        }
//        return toKeep.toArray(new String[0]);
//    }
}
