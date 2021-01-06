package Day17.Junit;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field a = personClass.getField("age");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);
    }
}
