package com.streamapi;
import java.util.*;
public class StreamAPIUseCases {
 public static void main(String[] args){
  List<Integer> n = Arrays.asList(5,2,9,1,7);
  System.out.println(n.stream().min(Integer::compare).get());
  System.out.println(n.stream().max(Integer::compare).get());
 }
}
