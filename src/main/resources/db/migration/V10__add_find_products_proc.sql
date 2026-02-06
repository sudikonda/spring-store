CREATE ALIAS findProductsByPrice AS $$
java.sql.ResultSet findProductsByPrice(java.sql.Connection conn, java.math.BigDecimal minPrice, java.math.BigDecimal maxPrice) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = conn.prepareStatement(
        "SELECT id, name, description, price, category_id FROM products WHERE price BETWEEN ? AND ? ORDER BY name"
    );
    ps.setBigDecimal(1, minPrice);
    ps.setBigDecimal(2, maxPrice);
    return ps.executeQuery();
}
$$;
