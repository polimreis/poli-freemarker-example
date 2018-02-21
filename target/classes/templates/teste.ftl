${data?string("dd/MM/yyyy")}

 

Prezado ${usuario}, segue a lista de produtos:

 

<#list produtos as p>

      - ${p.nome} - R$${p.preco}

</#list>