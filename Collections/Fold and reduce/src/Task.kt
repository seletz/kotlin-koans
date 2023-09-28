// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers.map { it.getOrderedProducts() }.reduce {acc, s -> acc intersect s }

fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap { it.products }.toSet()
