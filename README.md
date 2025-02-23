Documentação do código java de Criptografia e Descriptografia
##############################################################

Classe Java: CriptoDescriptoCifraCesar.java é muito vulnerável.
===============================================================
A Cifra de César é um dos métodos mais simples e antigos de criptografar mensagens, nomeado em homenagem a Júlio César, que supostamente a usou para 
proteger suas comunicações militares.
Essa técnica envolve deslocar as letras do alfabeto por um número fixo de lugares.
Por exemplo, com uma mudança de três, a letra 'A' se torna 'D', 'B' se torna 'E' e assim por diante.
Apesar de sua simplicidade, a Cifra de César formou a base para técnicas criptográficas modernas.


Classe Java: CriptoDescriptoChaveAES.java
=========================================
Esse código usa uma criptografia moderna, como a Advanced Encryption Standard (AES). O AES é um algoritmo de criptografia simétrica amplamente 
utilizado devido à sua segurança e eficiência.

Explicação:
Chave AES:

O método generateKey() gera uma chave AES de 128 bits.
A chave é armazenada em secretKey.
Criptografia e Descriptografia:

O método encrypt(String plainText) usa a chave AES para criptografar o texto de entrada e retorna o resultado em Base64.
O método decrypt(String encryptedText) descriptografa o texto criptografado em Base64 de volta ao texto original.


O padrão de criptografia avançada (Também conhecido como AES, Advanced Encryption Standard), é uma técnica para proteger dados usando algoritmos de 
criptografia. Ele é amplamente usado em todo o mundo para proteger informações confidenciais e é o padrão de criptografia de dados do governo dos EUA.
A criptografia AES usa uma técnica de chave simétrica para codificar e decodificar dados.
Isso indica que os processos de criptografia e descriptografia utilizam a mesma chave.
Veja algumas das características de chave de criptografia:

A criptografia AES emprega um tamanho de chave variável de 128, 192 ou 256 bits com um tamanho de bloco fixo de 128 bits.
É uma técnica de criptografia rápida e eficaz que pode ser usada em muitos aplicativos diferentes.
Ataques de força bruta e criptografia diferencial não podem quebrar a criptografia AES/
Algoritmos de criptografia usados em AES
As soluções Advanced Encryption Standard criptografam dados usando diferentes técnicas de criptografia. As seguintes técnicas são usadas:

SubBytes: usando uma tabela de substituição, também conhecida como caixa S, esse algoritmo substitui cada byte nos dados de entrada por um byte relacionado.
ShiftRows: nesta técnica, as linhas da matriz de dados são deslocadas um certo número de vezes, seguindo um padrão específico do AES.
MixColumns: trata-se uma técnica que usa uma matriz fixa para misturar as colunas da matriz de dados. Especificamente, manipulando cada byte de uma 
coluna usando uma função.
AddRoundKey: o método utiliza uma chave de rodada para fazer uma operação XOR com a saída dos três passos anteriores.

Maior segurança:
Para organizações de todos os tamanhos, violações de dados e riscos cibernéticos são uma preocupação significativa. O uso da técnica AES pode ajudar a proteger sua empresa contra esses perigos. Aqui estão três maneiras de melhorar sua segurança:

Usando o padrão de criptografia avançado: o método de criptografia mais popular atualmente é o método de criptografia avançada (AES) e por um bom motivo.
Ele oferece criptografia robusta que é difícil de quebrar, tornando-se uma excelente opção para proteger dados confidenciais.
A técnica de chave simétrica usa a mesma chave para criptografia e descriptografia, tornando-a rápida e eficaz. Com a utilização dessa técnica de 
criptografia, seus dados ficarão protegidos contra perigos e permanecerão confidenciais.

Protegendo seus dados: com o AES, seus dados estão protegidos contra acesso indesejado. Isso ocorre porque os dados criptografados são inúteis e não podem
ser lidos ou acessados sem a chave certa. Dessa forma, seus dados confidenciais estarão ainda mais protegidos, mesmo que um atacante consiga acessá-los,
pois eles não podem decodificá-los sem a chave.

Eliminação de possíveis violações: a criptografia AES impede que possíveis violações de segurança ocorram ao enviar ou armazenar dados confidenciais.
Ele protege seus dados contra interceptação e descodificação de hackers. Isso implica que seus dados serão ininteligíveis e inúteis sem a chave adequada,
mesmo que interceptados.

O Padrão Avançado de Criptografia também pode ajudar a garantir a adesão às leis de proteção de dados, como a Health Insurance Portability and 
Accountability Act (HIPAA) e o General Data Protection Regulation (GDPR) nos Estados Unidos.
