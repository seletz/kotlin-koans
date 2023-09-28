// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    customers.partition { c ->
        c.orders.count { !it.isDelivered } > c.orders.count { it.isDelivered }
    }.first.toSet()
