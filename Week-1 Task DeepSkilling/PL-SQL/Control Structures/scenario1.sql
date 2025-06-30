SET SERVEROUTPUT ON;

BEGIN
  FOR customer IN (
    SELECT customer_id, interest_rate
    FROM customers
    WHERE age > 60
  ) LOOP
    UPDATE customers
    SET interest_rate = interest_rate - 1
    WHERE customer_id = customer.customer_id;

    DBMS_OUTPUT.PUT_LINE('Updated customer ID ' || customer.customer_id || 
                         ': New interest rate = ' || (customer.interest_rate - 1));
  END LOOP;

  COMMIT;
END;



