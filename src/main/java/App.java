import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());

        boolean res = true;

        if(bean1.equals(bean2)){
            System.out.println(res);
        }

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catbean1 = (Cat) applicationContext2.getBean("cat");
        Cat catbean2 = (Cat) applicationContext2.getBean("cat");
        System.out.println(catbean1.getCat());
        System.out.println(catbean2.getCat());

        if(catbean1.equals(catbean2)){
            System.out.println(res);
        }




    }
}