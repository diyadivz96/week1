package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementAnArray {

	public static void main(String[] args)
	{
int[] arr= {1,2,3,4,7,6,8};
int j;
Arrays. sort(arr);

for (int i = 0; i < arr. length; i++)
{
	j=i+1;
	if(arr[i]!=j)
	{System.out.println(arr[i]);
	break;
	
}}}}