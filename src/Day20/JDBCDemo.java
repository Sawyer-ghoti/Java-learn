package Day20;



import Day19.domain.Emp;
import Day20.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo().findAll();
        System.out.println(list);
    }

    /**
     * 演示Util工具类
     * @return
     */
    public List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Emp emp = new Emp();
        List<Emp> list = null;

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn  = DriverManager.getConnection("jdbc:mysql:///jdbctest?serverTimezone=UTC","root","root");
            conn = JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<Emp>();
            while (rs.next()){
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if (rs != null){
//                try {
//                    rs.close();
//                }catch (SQLException e){
//                    e.printStackTrace();
//                }
//            }
//            if (stmt != null){
//                try {
//                    stmt.close();
//                }catch (SQLException e){
//                    e.printStackTrace();
//                }
//            }if (conn != null){
//                try {
//                    conn.close();
//                }catch (SQLException e){
//                    e.printStackTrace();
//                }
//            }
            JDBCUtils.close(rs,stmt,conn);
        }


    return list;
    }
}
