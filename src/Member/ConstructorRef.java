package Member;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRef {
    public static <Member> void main(String[] args) throws Exception {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("kimcoding");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("kimcoding", "김코딩");
    }
}

/*
Member(String id) 실행
Member(String name, String id) 실행
*/