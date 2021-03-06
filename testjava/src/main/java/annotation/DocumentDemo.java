package annotation;

import java.util.Arrays;

@DocumentA
class A {
}

class B extends A {
}

@DocumentB
class C {
}

class D extends C {
}

//测试
public class DocumentDemo {

    public static void main(String... args) {
        A instanceA = new B();
        System.out.println("已使用的@Inherited注解:" + Arrays.toString(instanceA.getClass().getAnnotations()));

        C instanceC = new D();

        System.out.println("没有使用的@Inherited注解:" + Arrays.toString(instanceC.getClass().getAnnotations()));



        if (instanceA.getClass().isAnnotationPresent(DocumentA.class)) {

        }

    }

    /**
     * 运行结果:
     已使用的@Inherited注解:[@com.zejian.annotationdemo.DocumentA()]
     没有使用的@Inherited注解:[]
     */
}