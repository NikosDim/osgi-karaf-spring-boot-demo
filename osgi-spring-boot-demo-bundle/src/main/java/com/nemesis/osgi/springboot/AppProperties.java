package com.nemesis.osgi.springboot;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {

    private Properties myProps;

    public AppProperties() {
        myProps = new Properties();
        InputStream is = null;
        try {
            is = AppProperties.class.getResourceAsStream("application.cfg");

            if (is != null) {
                myProps.load(is);
                System.out.println("SUCCESS: " + myProps.get("myProp"));
            } else {
                System.out.println("FAILED TO LOAD FILE");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
