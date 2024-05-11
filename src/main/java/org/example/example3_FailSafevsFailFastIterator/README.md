
The major difference is fail-safe iterator doesn’t throw any Exception, contrary to fail-fast Iterator.This is because they work on a clone of Collection instead of the original collection and that’s why they are called as the fail-safe iterator.

------------------------------------------------

ConcurrentHashMap is Fail-Safe Iterator which does not create separate copy


