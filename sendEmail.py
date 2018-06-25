import smtplib
from email.MIMEMultipart import MIMEMultipart
from email.MIMEText import MIMEText



fromaddr = "gerardrecinto@gmail.com"
toaddr = "gerardrecinto@gmail.com"
msg = MIMEMultipart()
msg['From'] = fromaddr
msg['To'] = toaddr
msg['Subject'] = "code"
body = "https://codeburst.io/how-i-took-a-break-from-job-searching-and-let-python-do-it-for-me-25f05c0f3dea"
msg.attach(MIMEText(body, 'plain'))
server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()
server.login(fromaddr, "Lolnice123!")
text = msg.as_string()
server.sendmail(fromaddr, toaddr, text)
server.quit()
