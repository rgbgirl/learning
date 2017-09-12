#-*-   coding :utf-8   -*-
'test'
__author__ ='ywbin'

import sys

def test():
    args = sys.argv
    if len(args) ==1:
        print 'Hello world!'
        pass
    elif len(args) ==2:
        print 'Hello, %s!' %args[1]
        pass
    else:
        print 'Too many arguments!'
        pass
    pass
if __name__ == '__main__':
    test()
    pass
