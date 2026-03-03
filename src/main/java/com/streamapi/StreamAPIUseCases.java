package com.streamapi;
import java.util.*;
public class StreamAPIUseCases {
 public static void main(String[] args){
  System.out.println(
   Arrays.asList(1,3,5,6,8)
   .stream().filter(n->n%2==0)
   .findFirst().orElse(-1)
  );
 }
}
