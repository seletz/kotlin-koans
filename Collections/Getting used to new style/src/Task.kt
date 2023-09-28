fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { it.length }

    val maximumSizeOfGroup = groupsByLength.values
        .map { l -> l.maxOf { it.length}  }
        .maxOrNull()

    return groupsByLength.values
        .firstOrNull { group -> group.size == maximumSizeOfGroup }
}
