package aop.springAopAnnotation;

import org.springframework.stereotype.Component;

@Component
public class CalculateImpl implements Calculate {

    public int add(int i, int j) {
        return i+j;
    }

    public int sub(int i, int j) {
        return i-j;
    }

}
