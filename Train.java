package com.masai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

import com.masai.utility.IDGeneration;

public class Trial {

	public static void main(String[] args)  {

		
		System.out.println(IDGeneration.generateId());

		System.out.println(Math.random());
	}

}