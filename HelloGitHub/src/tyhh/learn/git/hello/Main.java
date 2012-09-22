package tyhh.learn.git.hello;

import tyhh.learn.git.hello.entity.HelloEntity;

/**
 * Entry point class
 * 
 * @author tyhh
 *
 */
public class Main {

    /**
     * Entry point method
     * @param args
     */
    public static void main(String[] args) {
	HelloEntity hello = new HelloEntity("tyhh", "How do you do!");
	System.out.println(hello.getMessage());
    }
}
