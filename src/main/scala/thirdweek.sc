import objsets.{Tweet, NonEmpty, Empty}

val tweet1 = new Tweet("me", "tweet tweet", 200)

val tweet2 = new Tweet("you", "hello", 10)

val tweet3 = new Tweet("he", "yalle", 80)


val tweetSet = new NonEmpty(tweet1, new Empty, new Empty).incl(tweet2).incl(tweet3)

tweetSet.mostRetweeted














































