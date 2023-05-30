package ch07.Sample;

public class Director {
    private Builder builder; // 부모 타입

    // 생성자
    public Director(Builder builder) { // 부모 타입
        this.builder = builder;
    }

    // 문서를 만드는 메소드
    public void construct() { // 빌더에게 일을 시킴
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[] {
                "How are you?",
                "Hello.",
                "Hi.",
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[] {
                "Good morning.",
                "Good afternoon.",
                "Good evening.",
        });
        builder.close();
    }
}
