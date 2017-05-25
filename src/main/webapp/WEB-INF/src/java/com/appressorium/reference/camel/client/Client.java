package com.appressorium.reference.cxf.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.appressorium.reference.cxf.service.HelloWorld;


public final class Client {

    private Client() {
    }

    public static void main(String args[]) throws Exception {
        // START SNIPPET: client
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});

        HelloWorld client = (HelloWorld)context.getBean("client");

        String response = client.sayHi("Joe");
        System.out.println("Response: " + response);
        System.exit(0);
        // END SNIPPET: client
    }
}

String str = "{ \"name\": \"Alice\", \"age\": 20 }";
JSONObject obj = new JSONObject(str);
String n = obj.getString("name");
int a = obj.getInt("age");
System.out.println(n + " " + a);  // prints "Alice 20"

String str = "{ \"number\": [3, 4, 5, 6] }";
JSONObject obj = new JSONObject(str);
JSONArray arr = obj.getJSONArray("number");
for (int i = 0; i < arr.length(); i++)
    System.out.println(arr.getInt(i));
