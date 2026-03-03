package com.streamapi;
import java.util.*;
public class StreamAPIUseCases {
 public static void main(String[] args){
  List<Integer> n = Arrays.asList(2,4,6,9);
  System.out.println(n.stream().allMatch(x->x%2==0));
  System.out.println(n.stream().anyMatch(x->x%2==0));
 }
}
