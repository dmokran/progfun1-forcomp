import forcomp.Anagrams

val a = "abraCaDabra".toList
val b = "tuturutu".toList
val w = "abraCaDabra"
b.map(ch => (ch, ch))
//a.gro
val m = a.sorted.groupBy((ch: Char) => ch)
val ml = m.toList
//ml.map((ch: Char, l: List[Char]) => (ch, l.length))

val mb = List(('a', List('a','a')), ('b', List('b')))
mb.map({case (ch, l) => (ch, l.length)})


val pWord = w.toLowerCase.groupBy((ch: Char) => ch).toList
val curr = pWord.map({case (ch, l) => (ch, l.length)}).sorted

val exc = curr.find(el => el._1 == 'b')
val mmd = List("Make", "my", "day", "man")


Anagrams.sentenceOccurrences(mmd)


