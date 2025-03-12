package test.mytry.reflectionapi;


import java.lang.reflect.Method;

public class CallingMethod {
    public void test(Class a) {
        try{
            Class cl = a;
        Method[] md = cl.getDeclaredMethods();
            System.out.println("class ok");
            for (Method m: md){
                System.out.println(m.getName());
                if(m.getName().equalsIgnoreCase("add")){
                    Object aa =m.invoke(cl.getConstructors()[0].newInstance(),4, 3);
                    System.out.println(aa);
                }
            }

        }catch (Throwable e){
            System.err.println(e);
        }

    }

    public static void main(String[] args) {
        CallingMethod cl= new CallingMethod();
//        cl.test(MainMethod2.class);
        cl.test(method2.class);
    }
}
