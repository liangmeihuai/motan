package meihuai.common;

import com.weibo.api.motan.util.ReflectUtil;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tend on 2017/6/9.
 */
public class PrimitiveClassTest {
    public static void main(String[] args) {
        System.out.println("isprimitive="+Integer.class.isPrimitive());//false
        System.out.println("isprimitive="+int.class.isPrimitive());//true

        System.out.println("class Name="+Integer.class.getName());//java.lang.Integer
        System.out.println("simple Name="+Integer.class.getSimpleName());//Integer
    }

    public void testThrowException(){
        throw new IllegalStateException("interface not allow null!");
    }

    @Test
    public void testReflectUtils(){
        Integer inta=new Integer(1);
        Integer[][] intArr=new Integer[1][2];
        int[] iiArr=new int[]{1,2,3};
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        getNameWithoutCache(inta.getClass());
        getNameWithoutCache(intArr.getClass());
        getNameWithoutCache(iiArr.getClass());
        getNameWithoutCache(list.getClass());
        getNameWithoutCache(int.class);
    }

    private static String getNameWithoutCache(Class<?> clz) {
        if (!clz.isArray()) {
            System.out.println("clz...="+clz.getName());
            return clz.getName();
        }

        StringBuilder sb = new StringBuilder();
        while (clz.isArray()) {
            sb.append("[]");
            clz = clz.getComponentType();
        }
        System.out.println("clzzzzz=" + clz.getName() + sb.toString());
        return clz.getName() + sb.toString();
    }

    @Test
    public void testGetMethodParamDesc(){
        Method[] methods=PrimitiveClassTest.class.getMethods();
        if (methods!=null&&methods.length>0){
            for (Method method:methods){
                String methodName=method.getName();
                if ("method1".equalsIgnoreCase(methodName)){
                    String result=ReflectUtil.getMethodParamDesc(method);
                    System.out.println("result="+result);
                }
            }
        }

    }

    public void method1(int a,String b,List<String> c,Integer[][] d){

    }
}
