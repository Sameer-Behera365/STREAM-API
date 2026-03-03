package com.streamapi;
<<<<<<< HEAD

import java.util.*;
import java.util.stream.*;

public class StreamAPIUseCases {
    public static void main(String[] args){
        System.out.println(
            Arrays.asList(9,3,7,1,5)
            .stream()
            .sorted()
            .collect(Collectors.toList())
        );
    }
}
=======
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
>>>>>>> feature/UC2.5
