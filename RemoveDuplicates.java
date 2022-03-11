package assignment.week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
	

			String text = "We learn java basics as part of java sessions in java week1";
			
			String[] splitText = text.split(" ");
			
			LinkedHashSet<String> removeDup = new LinkedHashSet<String>(Arrays.asList(splitText));
			
			for(String noDup : removeDup) {
				System.out.println(noDup);
			}
			
	}
	
}
