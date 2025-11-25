Attribute VB_Name = "EnviarEmail"
Sub EnviarEmail()       'Criar funcao
    'Declara variaveis/obejetos
    Dim OutlookApp As Object    ' Aqui guardaremos a instância da aplicação Outlook. Como é Object
    Dim OutlookMail As Object   ' Declara a variável OutlookMail como Object. Ela representará o item de e-mail (MailItem).
    
    Set OutlookApp = CreateObject("Outlook.Application")    'Cria (ou obtém) uma instância do Outlook e atribui a OutlookApp./CreateObject("Outlook.Application") inicia o Outlook se ele não estiver aberto
    Set OutlookMail = OutlookApp.CreateItem(0)      'Usa a instância do Outlook para criar um novo item. O argumento 0 equivale à constante olMailItem (ou seja: criar um e-mail)
    
    With OutlookMail
        .To = "destinatario@email.com"      'Destinatario
        .CC = "destinatario1@email.com"     'Colocar em copia
        .Subject = "Relatório Automático"   'Assunto
        .Body = "Segue em anexo o relatório."   'Corpo do email
        .Attachments.Add ThisWorkbook.FullName 'anexa o próprio arquivo Excel (Precisa salvar o arquivo antes(pode automatizar isso))
        .Display       'mostra o emial(bom pra revisar antes de enviar(se quiser so envair escreva .send))
    End With
    
    MsgBox "E-mail enviado com sucesso!"
End Sub

Sub TesteCaminho()
    MsgBox "ThisWorkbook.FullName = " & ThisWorkbook.FullName
    MsgBox "ThisWorkbook.Path = " & ThisWorkbook.Path
End Sub

