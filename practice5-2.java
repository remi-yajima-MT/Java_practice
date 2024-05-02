package seattle;

public class SeattleEmployee {
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept(){
        return "無所属";
    }
}
// SeattleSSEmployee.java
package seattle;

public class SeattleSSEmployee extends SeattleEmployee {
    @Override
    public String getDept(){
        return "組織開発部";
    }
}

// Main.java
package seattle;

public class Main {
    public static void main(String[] args) {
        // SeattleEmployeeクラスのインスタンスを作成し、社員名をセット
        SeattleEmployee employee1 = new SeattleEmployee();
        employee1.setEmpName("矢島伶美");

        // SeattleSSEmployeeクラスのインスタンスを作成し、社員名をセット
        SeattleSSEmployee employee2 = new SeattleSSEmployee();
        employee2.setEmpName("Pepper");

        // 社員の情報を標準出力
        System.out.println("社員氏名：" + employee1.getEmpName());
        System.out.println("所属部署：" + employee1.getDept());
        System.out.println();

        System.out.println("社員氏名：" + employee2.getEmpName());
        System.out.println("所属部署：" + employee2.getDept());
    }
}

package seattle;

public class SeattleSSEmployee extends SeattleEmployee {
    // SeattleSSEmployeeクラスの独自の属性やメソッドを定義する
}