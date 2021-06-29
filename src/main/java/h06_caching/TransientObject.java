package h06_caching;

public class TransientObject {
	/*
	 Transient Object: Eğer bir nesne Javada  oluşturulup henüz herhangi bir Hibernate session'ı 
	 ile ilişkilnedirilmez ise bu nesnelere Transient nesne denilir.  
	      ÖRNEĞİN: Constructor ile POJO nesnesini oluşturup session.save() ile kaydetmez isek       
	*/
	/*
	 Persistent Object: Eğer oluşturulan bir nesne, bir session ile ilişkilendirilir ise 
	 bu nesneye "Persistent Object" denilir. 
	 ORNEGIN: session.save() 
	*/
	/*
	 Detached Object: Eğer nesneler ile ilişkili bir session kapatılırsa bu nesnelere "Detached Object" denilir.
	*/
	/*
	 Removed Object: Eğer bir kaydı veritabanından siler isek  ( delete(),remove() veya Query ile)
	                 bu nesneye "Removed Object- Silinmiş Nesne" denilir. 
	                 Not: Silinmiş nesneler Java'da hala var olurken veritabanından silinler.
	                 Not: Garbage Collector Transient, Detached Nesneleri kaldırabilir. 
	*/
}
