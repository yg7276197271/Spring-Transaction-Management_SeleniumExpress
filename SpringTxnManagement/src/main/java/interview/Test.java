package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
//arr[] = 4 2 6 8 3 9 12 24 
// target = 48 
// pair whose multiplication is 48 are as follows (2,24)(4,12),(6,8) 
	
	public static void main(String[] args) {
		//Iterate 
		//HashMap 2,0 4,1 ,6,2 8,
		int[] input = {4 ,2 ,6 ,8 ,3 ,9, 12 ,24};
		int n = input.length;
		Map map = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
		int target = 48;
		for(int i=0;i<n; i++){ 
			if(map.containsKey(target/input[i])){
				result.put(input[i], target/input[i]);
			}else{
				map.put(input[i], i);    //4,0 2,1 6,2 
			}
		}
		result.entrySet().stream().forEach( e -> System.out.println(e.getKey() + ", " +e.getValue()));
	}
	
	

}
