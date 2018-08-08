package co.grandcircus.lists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntFrequency {

	public static void main(String[] args) {
		
		int[] numbersForFrequency = {1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 10}; 
		//FrequencyArray(numbersForFrequency);
	    FrequencyHashMap(numbersForFrequency);
	    System.out.println(FrequencyHashMap(numbersForFrequency));
	    printMap(FrequencyHashMap(numbersForFrequency));
	}
        public static void FrequencyArray(int[] numbersForFrequency) {
               Arrays.sort(numbersForFrequency);
               int count = 0; 
               int start = 0;
               int move = 0; 
               
               while(start < numbersForFrequency.length){
                   for (int i = 0; i < numbersForFrequency.length; i++){
                       int currentInt = numbersForFrequency[start];;
                       if (currentInt == numbersForFrequency[i])
                       {
                           count++;
                           move++;
                       }
                   }
                    System.out.println("[" + numbersForFrequency[start] + "] : " + count);
                       count = 0;
                       start = start + move;
                       move = 0;
               }  
        
        }

        public static Map<Integer, Integer> FrequencyHashMap(int[] numbersForFrequency) {
       		Map<Integer, Integer> frequency = new HashMap<>();
       		for (int num : numbersForFrequency) {
       			if (frequency.containsKey(num)) {
       				frequency.replace(num, frequency.get(num) + 1);
       			}
       			frequency.putIfAbsent(num, 1);
       			}
       		return frequency;
       		}
       
        public static void printMap(Map<Integer, Integer> frequency) {
    		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
    			System.out.println("[" + entry.getKey() + "] : " + entry.getValue());
    		}
    	}
}
