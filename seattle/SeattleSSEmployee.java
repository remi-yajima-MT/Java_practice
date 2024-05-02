package seattle;
 
public class SeattleEmployee {
    /**
     * 社員氏名
     */
    private String empName;
    /**
     * 社員氏名を取得する
     * @return empName
     */
    public String getEmpName() {
        return empName;
    }
 
    /**
     * 社員氏名をセットする 
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
 
package seattle;
 
public class SeattleSSEmployee extends SeattleEmployee {
    // SeattleSSEmployeeクラスの独自の属性やメソッドを定義する
}

