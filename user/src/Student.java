public class Student {
    /**
     * 属性或特征去描述该类
     * 学号
     * 姓名
     * 年龄
     * 性别
     * 就读学校成绩
     */
    public String studentNo;
    public String studentName;
    public String studentAge;
    public String studentMale;
    public String StudentSchool;
    public int getStudentScore;


    /**
     * 行为
     * 上晚自习
     * 泡图书馆
     * 上课
     * 做广播体操
     */
    public void goToNightClass(){
        System.out.println("我们在认真上晚自习");
    }
    public void inTheLibrary(){
        System.out.println("我们在图书馆");
    }
    public void attendClass(){
        System.out.println("我们在上课");
    }
    public void broadCastGymnastics(){
        System.out.println("我们在做广播体操");
    }
    /**
     * 吃饭
     */
    public void eatDinner(){
        System.out.println(("我想要吃饭"));
    }
     public void goToHome(){
        System.out.println(("我想要回家"));
     }
}
