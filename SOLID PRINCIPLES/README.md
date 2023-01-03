## SOLID Yazılım Geliştirme Prensipleri

**S**ingle Responsibility Principle (SRP)<br>
**O**pen-**C**lose Principle (OCP)<br>
**L**iskov Substitution Principle (LSP)<br>
**I**nterface Segregation Principle (ISP)<br>
**D**ependency Injection Principle (DIP)

![alt text](https://github.com/erdemgencoglu/DESIGN-PATTERNS/blob/main/img/single-responsibility.png?raw=true)
| Tip | Açıklama |
| :---- | :--------------------------------------------------------------------------------------------------------------------------- |
| `SRP` | Bir işi yapabiliyor olmak o işi yapmak zorunda olduğunuzu göstermez.<br>Bir metot birden fazla farklı işi barındırmamalıdır. |

| Tip   | Açıklama                                                     |
| :---- | :----------------------------------------------------------- |
| `OCP` | Yazılan kod **gelişime** açık **değişime** kapalı olmalıdır. |

| Tip   | Açıklama                                                                                                |
| :---- | :------------------------------------------------------------------------------------------------------ |
| `LSP` | Bir class inherit ettiği classın tüm özelliklerini kullanmak (taşımak) ve yerine geçebilmek zorundadır. |

| Tip   | Açıklama                                                                                                                                                                     |
| :---- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ISP` | Bir interface içinde tanımlanan metot bu interface in inherit edildiği hiç bir yerde kullanılmıyorsa isb ihlali vardır. Interface kullanılmayacak fazla metot içermemelidir. |

| Tip   | Açıklama                                                                      |
| :---- | :---------------------------------------------------------------------------- |
| `DIP` | Daha üst seviyedeki bir class alt seviyedeki bir class a bağımlı olmamalıdır. |
