# JBCS-534
Httpd with mod_cache_disk on windows tests

./etc/httpd/conf.modules.d/00-mpm.conf
ThreadsPerChild      150
MaxRequestsPerChild    0

Note in my tests:
Fri Jun 01 08:30:07.244602 2018] [mpm_winnt:debug] [pid 9060:tid 2208] child.c(399): AH00334: Child: Accept thread listening on [::1]:443 using AcceptFilter data
According to the doc that makes no sense:
none uses accept()
connect uses AcceptEx()
and data isn't working on windows...
The customer uses:
[Tue May 29 09:05:42.421584 2018] [mpm_winnt:debug] [pid 7720:tid 19492] child.c(399): AH00334: Child: Accept thread listening on [::]:8183 using AcceptFilter none
+++
AcceptFilter https none
AcceptFilter http none
+++
So goods
