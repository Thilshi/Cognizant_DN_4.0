BEGIN
  FOR customer IN (
    SELECT customer_id
    FROM customers
    WHERE balance > 10000
  ) LOOP
    UPDATE customers
    SET IsVIP = 'TRUE'
    WHERE customer_id = customer.customer_id;
  END LOOP;
  COMMIT;
END;