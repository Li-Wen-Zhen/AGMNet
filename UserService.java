// UserService.java
public void deleteUser(String userId) {
    // 故意不使用参数化查询，制造 SQL 注入漏洞
    String sql = "DELETE FROM users WHERE id = " + userId; 
    jdbcTemplate.execute(sql);
}