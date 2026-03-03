package com.streamapi;
import java.util.*;
import java.util.stream.*;
public class StreamAPIUseCases {
 public static void main(String[] args){
  IntSummaryStatistics s =
   Arrays.asList(2,4,6,8)
   .stream().mapToInt(Integer::intValue)
   .summaryStatistics();
  System.out.println(s.getSum());
  System.out.println(s.getAverage());
 }
}
